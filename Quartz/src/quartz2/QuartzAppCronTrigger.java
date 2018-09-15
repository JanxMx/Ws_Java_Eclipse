/**
 * 4.-Trigger Quartz (Desancadenador de Quartz)
 *          -TRIGGER CRON:
 *                      permite a la expresión Cron (unix) 
 *                      especificar las fechas y horas para ejecutar el trabajo
 *          Este Ejemplo de Quartz CronTrigger,
 *          se ejecutará el metodo PrintMe(), cada 30 segundos.
 */

package quartz2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;
import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.impl.StdSchedulerFactory;

public class QuartzAppCronTrigger {
	
	public static void main(String[] args) throws Exception {

		Properties prop = new Properties();
		InputStream is = null;

		try {
			is = new FileInputStream("src/quartz2/DatosQuartz.properties");
			prop.load(is);

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		/**
		 * 3.-Scheduler JobDetail Inicializa el Objeto JobDetail, Definir un "nombre de
		 * la tarea" y vincularlo con Scheduler Job (Programador de trabajo paso no.2)
		 */

		// especifica los detalles del Sceduler Task

		RunMeTask task = new RunMeTask();

		JobDetail job = new JobDetail();
		job.setName("runMeJob");
		job.setJobClass(RunMeJob.class);

		// Asignar el nombre de la Tarea a un mapa,
		// es el unico vinculo entre el Trabajo y JobDetail
		Map dataMap = job.getJobDataMap();
		dataMap.put("runMeTask2", task);

		// Configuracion del tiempo del Scheduler
		CronTrigger trigger = new CronTrigger();
		// se ejecutará el metodo PrintMe(), cada 30 segundos
		trigger.setName("runMeJobTesting");
		String horario = prop.getProperty("horario");
		trigger.setCronExpression(horario);
		// trigger.setCronExpression("0/10 * * * * ?");

		/**
		 * 5.-Scheduler -Link JobDetail y Trigger juntos y programados
		 */
		Scheduler scheduler = new StdSchedulerFactory().getScheduler();
		scheduler.start();
		scheduler.scheduleJob(job, trigger);
	}

}

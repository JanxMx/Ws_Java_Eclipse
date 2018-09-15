/**
 * 2.- Scheduler Job (Programador  de Trabajo):
 *          -Crea un trabajo para implementar la interfaz Quartz Job
 *          asi como el metodo execute().
 *          -Obtiene el Scheduler Task de JobDatails via "task name"
 *          y especifica cual metodo ejecutar del shuelder task.
 */

package quartz2;

import java.util.Map;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;


public class RunMeJob implements Job{
    public void execute(JobExecutionContext context)
	throws JobExecutionException {

		Map dataMap = context.getJobDetail().getJobDataMap();
		RunMeTask task = (RunMeTask)dataMap.get("runMeTask2");
		task.printMe();
	}

}

import activity.Activity;

import java.util.List;

public class WorkflowMachine {
    public void execute(Workflow workflow) {

        for (Activity activity : workflow.activities) {
            activity.execute();
        }

    }
}

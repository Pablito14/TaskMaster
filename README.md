# TaskMaster
An app that allows tracking tasks on a project because Trello boards are cool, but why do we have to use Trello? 

## Feature Tasks
* Users are able to create a Project.
* Users are able to add a task to a Project.
* Both Tasks and Projects are saved locally to a database.
* A user is able to “Assign” themselves a task, “Accept” that task, and later “Complete” that task.
* A task has one property which represents what state the task is in.
    * Available - the task has been created, and is publicly available, but no other user has claimed it yet
    * Assigned - someone has been assigned that task
    * Accepted - the assignee has accepted that task
    * Finished - the task is totally complete Write tests making sure a task progresses through it’s states properly
package job_mgr

class Request {

    String content_id
    String description
    static hasMany = [executions: Execution]
    static constraints = {
    }
}

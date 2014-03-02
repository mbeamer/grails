package job_mgr

class Execution {

    Date started
    Date completed
    Receipt receipt
    static constraints = {
        receipt nullable: true
    }
}

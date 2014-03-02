package job_mgr
import grails.rest.RestfulController

class RequestController extends RestfulController{
    static responseFormat = ['json', 'xml']
    static scaffold = true

    RequestController() {
        super(Request)
    }
}


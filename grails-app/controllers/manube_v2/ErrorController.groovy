package manube_v2

class ErrorController {

    def index() { }

    def error() {
        render(
                view: "error",
                model:
                        [
                                errorMsgTitle: params.errorMsgTitle,
                                errorMsg: params.errorMsg,
                                errorCode: params.errorCode
                        ]
        )
    }
}

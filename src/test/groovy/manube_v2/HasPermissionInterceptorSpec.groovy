package manube_v2

import grails.testing.web.interceptor.InterceptorUnitTest
import spock.lang.Specification

class HasPermissionInterceptorSpec extends Specification implements InterceptorUnitTest<HasPermissionInterceptor> {

    def setup() {
    }

    def cleanup() {

    }

    void "Test hasPermission interceptor matching"() {
        when:"A request matches the interceptor"
            withRequest(controller:"hasPermission")

        then:"The interceptor does match"
            interceptor.doesMatch()
    }
}

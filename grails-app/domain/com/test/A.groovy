package com.test

import grails.rest.Resource

@Resource(uri='/as', formats=['json', 'xml'])
class A {

    static constraints = {
    }
}

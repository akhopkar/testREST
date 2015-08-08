package com.test

import grails.rest.Resource

@Resource(uri='/a4s', formats=['json', 'xml'])
class A4 {

    static constraints = {
    }
}

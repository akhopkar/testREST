package com.test

import grails.rest.Resource

@Resource(uri='/a2s', formats=['json', 'xml'])
class A2 {

    static constraints = {
    }
}

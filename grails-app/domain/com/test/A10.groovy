package com.test

import grails.rest.Resource

@Resource(uri='/a10s', formats=['json', 'xml'])
class A10 {

    static constraints = {
    }
}

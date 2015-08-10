package com.test

import grails.rest.Resource

@Resource(uri='/a14s', formats=['json', 'xml'])
class A14 {

    String name

    static constraints = {
    }
}

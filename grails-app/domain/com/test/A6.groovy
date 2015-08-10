package com.test

import grails.rest.Resource

@Resource(uri='/a6s', formats=['json', 'xml'])
class A6 {

  String name

    static constraints = {
    }
}

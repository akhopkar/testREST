package com.test

import grails.rest.Resource

@Resource(uri='/a3s', formats=['json', 'xml'])
class A3 {

  String name

    static constraints = {
    }
}

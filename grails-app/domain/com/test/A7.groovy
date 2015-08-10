package com.test

import grails.rest.Resource

@Resource(uri='/a7s', formats=['json', 'xml'])
class A7 {

  String name

    static constraints = {
    }
}

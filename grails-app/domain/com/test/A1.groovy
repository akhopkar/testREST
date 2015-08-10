package com.test

import grails.rest.Resource

@Resource(uri='/a1s', formats=['json', 'xml'])
class A1 {

  String name

    static constraints = {
    }
}

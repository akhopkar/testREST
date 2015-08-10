package com.test

import grails.rest.Resource

@Resource(uri='/a13s', formats=['json', 'xml'])
class A13 {

  String name

    static constraints = {
    }
}

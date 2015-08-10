package com.test

import grails.rest.Resource

@Resource(uri='/a12s', formats=['json', 'xml'])
class A12 {

  String name

    static constraints = {
    }
}

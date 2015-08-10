package com.test

import grails.rest.Resource

@Resource(uri='/a5s', formats=['json', 'xml'])
class A5 {

  String name

    static constraints = {
    }
}

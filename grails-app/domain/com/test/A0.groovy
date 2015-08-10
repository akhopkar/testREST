package com.test

import grails.rest.Resource

@Resource(uri='/a0s', formats=['json', 'xml'])
class A0 {

  String name

    static constraints = {
    }
}

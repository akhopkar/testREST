package com.test

import grails.rest.Resource

@Resource(uri='/a9s', formats=['json', 'xml'])
class A9 {

  String name

    static constraints = {
    }
}

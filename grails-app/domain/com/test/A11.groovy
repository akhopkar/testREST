package com.test

import grails.rest.Resource

@Resource(uri='/a11s', formats=['json', 'xml'])
class A11 {

  String name

    static constraints = {
    }
}

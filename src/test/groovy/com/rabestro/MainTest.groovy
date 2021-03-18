package com.rabestro

import spock.lang.Specification

class MainTest extends Specification {
    def "greetings for Spock's and his friends' names"() {
        given:
        def main = new Main()

        expect:
        main.hello(name) == greeting

        where:
        name     | greeting
        "Spock"  | "Hello, Spock!"
        "Kirk"   | "Hello, Kirk!"
        "Scotty" | "Hello, Scotty!"
    }
}

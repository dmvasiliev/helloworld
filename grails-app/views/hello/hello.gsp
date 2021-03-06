<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title><g:message code="welcome.title"/></title>
    <style type="text/css" media="screen">
    #status {
        background-color: #eee;
        border: .2em solid #fff;
        margin: 2em 2em 1em;
        padding: 1em;
        width: 12em;
        float: left;
        -moz-box-shadow: 0px 0px 1.25em #ccc;
        -webkit-box-shadow: 0px 0px 1.25em #ccc;
        box-shadow: 0px 0px 1.25em #ccc;
        -moz-border-radius: 0.6em;
        -webkit-border-radius: 0.6em;
        border-radius: 0.6em;
    }

    .ie6 #status {
        display: inline; /* float double margin fix http://www.positioniseverything.net/explorer/doubled-margin.html */
    }

    #status ul {
        font-size: 0.9em;
        list-style-type: none;
        margin-bottom: 0.6em;
        padding: 0;
    }

    #status li {
        line-height: 1.3;
    }

    #status h1 {
        text-transform: uppercase;
        font-size: 1.1em;
        margin: 0 0 0.3em;
    }

    #page-body {
        margin: 2em 1em 1.25em 18em;
    }

    h2 {
        margin-top: 1em;
        margin-bottom: 0.3em;
        font-size: 1em;
    }

    p {
        line-height: 1.5;
        margin: 0.25em 0;
    }

    #controller-list ul {
        list-style-position: inside;
    }

    #controller-list li {
        line-height: 1.3;
        list-style-position: inside;
        margin: 0.25em 0;
    }

    @media screen and (max-width: 480px) {
        #status {
            display: none;
        }

        #page-body {
            margin: 0 1em 1em;
        }

        #page-body h1 {
            margin-top: 0;
        }
    }
    </style>
</head>

<body>
<div id="status" role="complementary">
    <a href="#page-body" class="skip"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>

    <h1><g:message code="welcome.app.status"/></h1>
    <ul>
        <li><g:message code="app.version"/>: <g:meta name="app.version"/></li>
        <li><g:message code="grails.version"/>: <g:meta name="app.grails.version"/></li>
        <li><g:message code="groovy.version"/>: ${GroovySystem.getVersion()}</li>
        <li><g:message code="jvm.version"/>: ${System.getProperty('java.version')}</li>
        <li><g:message code="reloading.active"/>: ${grails.util.Environment.reloadingAgentEnabled}</li>
        <li><g:message code="controllers"/>: ${grailsApplication.controllerClasses.size()}</li>
        <li><g:message code="app.domains"/>: ${grailsApplication.domainClasses.size()}</li>
        <li><g:message code="app.services"/>: ${grailsApplication.serviceClasses.size()}</li>
        <li><g:message code="app.tag.libraries"/>: ${grailsApplication.tagLibClasses.size()}</li>
    </ul>

    <h1><g:message code="installed.plugins"/></h1>
    <ul>
        <g:each var="plugin" in="${applicationContext.getBean('pluginManager').allPlugins}">
            <li>${plugin.name} - ${plugin.version}</li>
        </g:each>
    </ul>
</div>

<div id="page-body" role="main">
    <h1><g:message code="welcome.title"/></h1>

    <p><g:message code="welcome.body"/></p>

    <div id="controller-list" role="navigation">
        <h2><g:message code="available.controllers"/>:</h2>
        <ul>
            <g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName }}">
                <li class="controller"><g:link controller="${c.logicalPropertyName}">${c.fullName}</g:link></li>
            </g:each>
        </ul>
    </div>
</div>
</body>
</html>

<%@ page import="helloworld.pokemon.User" %>



<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'birthday', 'error')} required">
	<label for="birthday">
		<g:message code="user.birthday.label" default="Birthday" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="birthday" precision="day"  value="${userInstance?.birthday}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="user.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${userInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'pokemon', 'error')} ">
	<label for="pokemon">
		<g:message code="user.pokemon.label" default="Pokemon" />
		
	</label>
	<g:select name="pokemon" from="${helloworld.pokemon.Pokemon.list()}" multiple="multiple" optionKey="id" size="5" value="${userInstance?.pokemon*.id}" class="many-to-many"/>

</div>


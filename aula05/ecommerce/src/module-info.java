module LibApp {
	exports br.com.juliopereira.application.services;
	exports br.com.juliopereira.infra.databases;
	exports br.com.juliopereira.application.controllers;
	exports br.com.juliopereira.domain.repositories;
	exports br.com.juliopereira.domain.entidades;

	requires java.sql;
}
# GraphQL Codegen Maven plugin #

[![Build Status](https://travis-ci.com/kobylynskyi/graphql-java-codegen-maven-plugin.svg?branch=master)](https://travis-ci.com/kobylynskyi/graphql-java-codegen-maven-plugin)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

This document describes the maven plugin for GraphQL Generator.

### Description

This Maven plugin is able to generate the following classes based on your GraphQL schema:
* Interfaces for GraphQL queries, mutations and subscriptions
* Interfaces for GraphQL unions
* POJO classes for GraphQL types
* Enum classes for each GraphQL enum

### Plugin Setup

*TBD*

### Plugin Configuration

*TBD*

### Additional Configurations

*TBD*


#### Plugin Options

| Key                     | Data Type          | Default value | Description |
| ----------------------- | ------------------ | ------------- | ----------- |
| graphqlSchemaPaths      | List(String)       | None          | GraphQL schema locations. You can supply multiple paths to GraphQL schemas. |
| packageName             | String             | Empty         | Java package for generated classes. |
| outputDir               | String             | None          | The output target directory into which code will be generated. |
| customTypesMapping      | Map(String,String) | Empty         | Map of (GraphQL Schema Type) to (Java Type). Can be used to supply custom mappings for scalars. |
| modelNamePrefix         | String             | Empty         | Sets the prefix for GraphQL model classes (type, input, interface, enum, union). |
| modelNameSuffix         | String             | Empty         | Sets the suffix for GraphQL model classes (type, input, interface, enum, union). |
| apiPackage              | String             | Empty         | Java package for generated api classes (Query, Mutation, Subscription). |
| modelPackage            | String             | Empty         | Java package for generated model classes (type, input, interface, enum, union). |


### Example

[graphql-codegen-maven-plugin-example](graphql-codegen-maven-plugin-example)


### Inspired by
[swagger-codegen](https://github.com/swagger-api/swagger-codegen)


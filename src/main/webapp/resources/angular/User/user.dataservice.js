'use strict'

angular
	.module('musicapp', [])
	.factory('dataservice', dataservice);

dataservice.$inject = ['$http', '$q'];

function dataservice($http, $q) {
	var service = {
			getUser: getUser
        };

        return service;
        
        function getUser() {
            var deferred = $q.defer();
            $http.get('http://localhost:8080/musicapp/user/{userName}')
                .then(
                function (response) {
                    deferred.resolve(response.data);
                },
                function(errResponse){
                    console.error('Error while fetching Users');
                    deferred.reject(errResponse);
                }
            );
            return deferred.promise;
        };

//        function getUser() {
//            return $http({method: 'GET', url: 'com.springmvc.musicapp.controller.RegistrationController'}).
//                success(function(data, status, headers, config) {
//                    return data;
//                }).
//                error(function(data, status, headers, config) {
//                });
//        };
};
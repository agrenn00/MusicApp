'use strict';

angular
	.module('musicapp', [])
	.controller('UserCtrl', UserCtrl);

UserCtrl.$inject = ['dataservice'];

function UserCtrl(dataservice) {
	var vm = this;
	vm.user = [];
//    vm.getUser = getUser;
//    vm.user = [];
//    
//    activate();
//
//    function activate() {
//        return getUser();
//    }
//
//    function getUser() {
//        return dataservice.getUser()
//            .then(function(data){
//                vm.user = data.data;
//                return vm.user;
//            });
//    }
};	

	getUser();
	function getUser() {
		dataservice.getUser()
        .then(
        function(d) {
            vm.user = d;
        },
        function(errResponse){
            console.error('Error while fetching Users');
        }
    );
}

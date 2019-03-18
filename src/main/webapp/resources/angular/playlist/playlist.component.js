(function() {
	'use strict'

angular
	.module('playlist')
	.component('playlist', {
		templateUrl: 'resources/angular/playlist/playlist.tmpl.html',
		controller: function PlaylistCtrl() {
			
			var vm = this;
			
			vm.newPlaylist = function() {
				title: '';
				
			};
			
			vm.searchInput = function() {
//				vm.input = "hello";
			};
			
			
			vm.createNewPlaylist = function() {
//				vm.playlist = "hello";
				vm.newPlaylist = {
						title: ''
				}
				
			};
		},
		controllerAs: 'vm',
		bindToController: true
	})})();

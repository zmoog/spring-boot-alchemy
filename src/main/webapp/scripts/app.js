(function() {

	/**
	 * alchemy Module
	 *
	 * Description
	 */
	angular.module('alchemy', ['ui.router'])
		.config(['$stateProvider', function($stateProvider) {
			

			$stateProvider
				.state('home', {
					url: '/',
					templateUrl: 'partials/home.html'
				})
				.state('about', {
					url: '/about',
					templateUrl: 'partials/about.html'
				})
				.state('contact', {
					url: '/contact',
					templateUrl: 'partials/contact.html'
				});

		}])

		.run(['$state', function($state) {
			$state.transitionTo('home');
		}])

})();
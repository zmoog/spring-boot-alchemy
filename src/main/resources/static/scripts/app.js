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
				.state('account_list', {
					url: '/account',
					templateUrl: 'partials/account_list.html',
					controller: 'AccountListCtrl as ctrl'
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
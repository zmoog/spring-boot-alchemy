(function() {

	angular.module('alchemy')
		.factory('AccountService', ['$http', function($http){

			// var accounts = {};

			return {
				list: function() {
					return $http.get('/api/accounts.json');
				}
			};
		}])

})();
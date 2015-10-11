(function() {

	angular.module('alchemy')

		.factory('AccountService', ['$http', function($http) {
			return {
				list: function() {
					return $http.get('/api/v1/accounts/');
				}
			};
		}]);

})();





(function() {

	angular.module('alchemy')
		.controller('AccountListCtrl', ['AccountService', '$log', function(AccountService, $log){
			
			var self = this;

			var list = AccountService.list().then(function(response) {

				$log.info(response.data);

				self.account_list = response.data;
			});


		}])

})();
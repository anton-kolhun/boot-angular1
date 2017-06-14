'use strict';
var mod1 = angular.module('for-fun', ['ui.router']);
mod1.config(function ($stateProvider, $urlRouterProvider) {
    $urlRouterProvider.otherwise('/');
    $stateProvider
        .state('home', {
            url: '/',
            views: {
                'header-view': {
                    templateUrl: 'html/header.html'
                },
                'footer-view': {
                    templateUrl: 'html/footer.html'
                },
                'content-view': {
                    templateUrl: 'html/main.html'
                }

            }

        })

        .state('search', {
            url: '/search',
            views: {
                'content-view': {
                    templateUrl: 'html/search.html',
                    controller: 'Controller1'
                },
                'header-view': {
                    templateUrl: 'html/header.html'
                },
                'footer-view': {
                    templateUrl: 'html/footer.html'
                }
            }

        })

})


mod1
    .controller('Controller1', ['$scope', '$http', function ($scope, $http) {
            $scope.test = '33';
            $scope.people = [];
            $scope.findPeople = function () {
                $http.get('/person')
                    .then(function (response) {
                        console.log(response);
                        angular.forEach(response.data, function (value) {
                            $scope.people.push(value);
                        })
                    });
            }
        }]
    )




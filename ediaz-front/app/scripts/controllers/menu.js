'use strict';

angular.module('ediazFrontApp')
  .controller('MenuCtrl', function ($scope, $location) {
    var possibilities,
        updateMenu;

    possibilities = {
      '/': 'home',
      '/news': 'news',
      '/contact': 'contact'
    };

    updateMenu = function () {
      $scope.selection = possibilities[$location.path()];
    };


    $scope.$on('$locationChangeStart', function () {
      updateMenu();
    });

    updateMenu();
  });

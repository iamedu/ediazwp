'use strict';

angular.module('ediazFrontApp')
  .controller('MainCtrl', function ($scope) {
    var sections,
        nothings;

    sections = {
      developer: {
        selected: true
      },
      projects: {
        selected: true
      },
      technology: {
        selected: true
      },
      experiments: {
        selected: true
      }
    };

    nothings = ['nothingCivilized', 'nothingHello', 'nothingValues'];

    $scope.toggleSection = function (section) {
      var sectionRef = $scope.sections[section];
      sectionRef.selected = !sectionRef.selected;

      $scope.nothingSelected = _.every(sections, function (s) {
        return !s.selected;
      });
    };

    $scope.$watch('nothingSelected', function () {
      var size,
          randomIdx;
      if($scope.nothingSelected) {
        size = _.size(nothings);
        randomIdx = _.random(0, size - 1);
        $scope.selectedNothing = nothings[randomIdx];
      }
    });

    $scope.sections = sections;

    //Bootstrap stuff
    jQuery('.tag').tooltip();

  });

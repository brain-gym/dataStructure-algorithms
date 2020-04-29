var app = angular.module('algorithm', []);

app.controller('AlgorithmsController', ['$scope', function ($scope) {
    $scope.algorithms = [
        {
            'title': 'Binary Search',
            'hasMediumPost': false,
            'mediumPostUrl': '',
            'hasGithubCode': false,
            'githubCodeUrl': 'https://github.com/brain-gym/dataStructure-algorithms/blob/master/competitive%20programming/src/com/company/utils/BinarySearch.java',
            'studied': true
        },

        // {
        //     'title': 'Insertion Sort',
        //     'hasMediumPost': false,
        //     'mediumPostUrl': '',
        //     'hasGithubCode': false,
        //     'githubCodeUrl': '',
        //     'studied': true
        // },

        // {
        //     'title': 'Selection Sort',
        //     'hasMediumPost': false,
        //     'mediumPostUrl': '',
        //     'hasGithubCode': false,
        //     'githubCodeUrl': '',
        //     'studied': true
        // },

        // {
        //     'title': 'Merge Sort',
        //     'hasMediumPost': false,
        //     'mediumPostUrl': '',
        //     'hasGithubCode': false,
        //     'githubCodeUrl': '',
        //     'studied': true
        // },
    ];
}]);

app.controller('DataStructuresController', ['$scope', function ($scope) {
    $scope.dataStructures = [
        {
            'title': 'Linked List',
            'hasMediumPost': false,
            'mediumPostUrl': null,
            'hasGithubCode': true,
            'githubCodeUrl': 'https://github.com/brain-gym/dataStructure-algorithms/blob/master/competitive%20programming/src/com/company/dataStructure/LinkedList.java',
            'studied': true
        }
    ];
}]);
var app = angular.module('algorithm', []);

app.controller('AlgorithmsController', ['$scope', function ($scope) {
    $scope.algorithms = [
        {
            'title': 'Binary Search',
            'hasMediumPost': false,
            'mediumPostUrl': '',
            'hasGithubCode': true,
            'githubCodeUrl': 'https://github.com/brain-gym/dataStructure-algorithms/blob/master/competitive%20programming/src/com/company/utils/BinarySearch.java',
            'studied': true
        },

        {
            'title': 'Quick Sort',
            'hasMediumPost': true,
            'mediumPostUrl': 'https://medium.com/@itIsMadhavan/algorithms-quick-sort-4e611ec07042',
            'hasGithubCode': true,
            'githubCodeUrl': 'https://github.com/brain-gym/dataStructure-algorithms/blob/master/competitive%20programming/src/com/company/utils/algorithm/QuickSort.java#L3',
            'studied': false,
            'inprogress': true
        },

        {
            'title': 'Merge Sort',
            'hasMediumPost': false,
            'mediumPostUrl': '',
            'hasGithubCode': false,
            'githubCodeUrl': '',
            'studied': false,
            'inprogress': true
        },

        {
            'title': 'Insertion Sort',
            'hasMediumPost': false,
            'mediumPostUrl': '',
            'hasGithubCode': false,
            'githubCodeUrl': '',
            'studied': false,
            'inprogress': true
        },
        {
            'title': 'Heap Sort',
            'hasMediumPost': false,
            'mediumPostUrl': '',
            'hasGithubCode': false,
            'githubCodeUrl': '',
            'studied': false,
            'inprogress': true
        },
        {
            'title': 'Bubble Sort',
            'hasMediumPost': false,
            'mediumPostUrl': '',
            'hasGithubCode': false,
            'githubCodeUrl': '',
            'studied': false,
            'inprogress': true
        },
        {
            'title': 'Selection Sort',
            'hasMediumPost': false,
            'mediumPostUrl': '',
            'hasGithubCode': false,
            'githubCodeUrl': '',
            'studied': false,
            'inprogress': true
        },
    ];
}]);

app.controller('DataStructuresController', ['$scope', function ($scope) {
    $scope.dataStructures = [
        {
            'title': 'Array',
            'hasMediumPost': true,
            'mediumPostUrl': 'https://medium.com/@itIsMadhavan/data-structure-array-quick-lookup-for-interview-a09caeb835f5',
            'hasGithubCode': true,
            'githubCodeUrl': 'https://github.com/brain-gym/dataStructure-algorithms/blob/master/competitive%20programming/src/com/company/dataStructure/Array.java#L8',
            'studied': false,
            'inprogress': true
        },
        {
            'title': 'Multi-Dimentional Array',
            'hasMediumPost': false,
            'mediumPostUrl': null,
            'hasGithubCode': false,
            'githubCodeUrl': '',
            'studied': false,
            'inprogress': true
        },
        {
            'title': 'Linked List',
            'hasMediumPost': false,
            'mediumPostUrl': null,
            'hasGithubCode': true,
            'githubCodeUrl': 'https://github.com/brain-gym/dataStructure-algorithms/blob/master/competitive%20programming/src/com/company/dataStructure/LinkedList.java',
            'studied': false,
            'inprogress': true
        },
        {
            'title': 'Doubly linked list',
            'hasMediumPost': false,
            'mediumPostUrl': null,
            'hasGithubCode': false,
            'githubCodeUrl': '',
            'studied': false,
            'inprogress': true
        },
        {
            'title': 'Stack',
            'hasMediumPost': false,
            'mediumPostUrl': null,
            'hasGithubCode': false,
            'githubCodeUrl': '',
            'studied': false,
            'inprogress': true
        },
        {
            'title': 'Queue',
            'hasMediumPost': false,
            'mediumPostUrl': null,
            'hasGithubCode': false,
            'githubCodeUrl': '',
            'studied': false,
            'inprogress': true
        },
        {
            'title': 'Graph',
            'hasMediumPost': false,
            'mediumPostUrl': null,
            'hasGithubCode': false,
            'githubCodeUrl': '',
            'studied': false,
            'inprogress': true
        },
    ];
}]);
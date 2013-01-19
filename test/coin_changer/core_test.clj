(ns coin-changer.core-test
  (:use clojure.test
        coin-changer.core))

(deftest test-change
  (are [cents total] (= (change cents) total)
       0 []
       1 [1]
       2 [1 1]
       5 [5]
       8 [5 1 1 1]
       10 [10]
       16 [10 5 1]
       25 [25]
       30 [25 5]
       49 [25 10 10 1 1 1 1]
       -1 []))

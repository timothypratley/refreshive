(ns refreshive.core
  (:require [clojure.test :refer :all]))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

;; does not get found
(deftest t
  (is (= 1 2)))
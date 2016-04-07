(ns ck.forms-test
  (:require [clojure.test :refer :all]
            [ck.forms :refer :all])
  (:use midje.sweet))

(def f [::test [:form
                {:name "foo"}
                [:field {}]
                [:img {}]
                [:table {}]]])

(defmethod render* [::test :form] [_ [_ opts & fields]]
  (let [rendered-fields (apply str (map (partial render* ::test) fields))]
    (str "<form name='" (:name opts) "'>"
         rendered-fields
         "</form>")))

(defmethod render* [::test :field] [_ _]
  "<field/>")

(defmethod render* [::test :img] [_ _]
  "<img/>")

(defmethod render* [::test :table] [_ _]
  "<table/>")


(fact (render* (first f) (second f)) => "<form name='foo'><field/><img/><table/></form>")



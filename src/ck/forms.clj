(ns ck.forms)

(defn- render-dispatch
  [engine form]
  [engine (first form)])

(defmulti render* #'render-dispatch)

(ns example-web.core
  (:require [hiccup.core :refer [html]]))

(defn make-page [request]
  [:div
   [:h1 "Hello World"]
   [:p "Generated from Hiccup!"]])

(defn handler [request]
  {:status 200
   :body (html (make-page request))})

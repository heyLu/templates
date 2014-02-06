(ns clj-web.server
  (:require [compojure.core :as c])
  (:use [ring.middleware.params :only (wrap-params)]
        [ring.middleware.keyword-params :only (wrap-keyword-params)]
        [compojure.core :only (GET POST PUT)]
        [hiccup.core :only (html)]))

(c/defroutes routes
  (GET "/" []
    {:status 200
     :body "hello, traveler!

# intro

this is a little webserver. in clojure, no less.

have fun!

# api

     GET / - this handy document

     GET /hello/:name - greets you with a name
"
     :headers {"Content-Type" "text/plain"}})
  (GET "/hello/:name" [name]
    (str "hello, " name "!")))

(def app
  (-> routes
      wrap-keyword-params
      wrap-params))

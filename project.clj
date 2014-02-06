(defproject clj-web "0.0-dev"
  :dependencies [[org.clojure/clojure "1.5.1"]

                 [ring "1.2.1"]
                 [compojure "1.1.6"]
                 [hiccup "1.0.5"]]
  :plugins [[lein-ring "0.8.10"]]
  :ring {:handler clj-web.server/app})

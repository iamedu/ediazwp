(defproject ediaz-back "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [lib-noir "0.6.6"]
                 [compojure "1.1.5"]
                 [ring-server "0.2.8"]
                 [clabango "0.5"]
                 [com.taoensso/timbre "2.1.2"]
                 [com.postspectacular/rotor "0.1.0"]
                 [com.taoensso/tower "1.7.1"]
                 [markdown-clj "0.9.28"]
                 ;Custom dependencies
                 [com.cemerick/friend "0.1.5"]
                 [org.postgresql/postgresql "9.2-1003-jdbc4"]
                 [clojurewerkz/mailer "1.0.0-alpha3"]
                 [http-kit "2.1.8"]
                 [ring/ring-json "0.2.0"]
                 [ring-anti-forgery "0.2.1"]
                 [clj-rss "0.1.3"]
                 [com.novemberain/validateur "1.2.0"]
                 [lobos "1.0.0-beta1"]]
  :plugins [[lein-ring "0.8.5"]]
  :ring {:handler ediaz-back.handler/war-handler
         :init    ediaz-back.handler/init
         :destroy ediaz-back.handler/destroy}
  :profiles
  {:production {:ring {:open-browser? false
                       :stacktraces?  false
                       :auto-reload?  false}}
   :dev {:dependencies [[ring-mock "0.1.5"]
                        [ring/ring-devel "1.1.8"]]}}
  :min-lein-version "2.0.0")

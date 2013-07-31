(ns ediaz-back.routes.home
  (:use compojure.core)
  (:require [ediaz-back.views.layout :as layout]
            [ediaz-back.util :as util]))

(defn home-page []
  (layout/render "index.html"))

(defroutes home-routes
  (GET "/" [] (home-page)))

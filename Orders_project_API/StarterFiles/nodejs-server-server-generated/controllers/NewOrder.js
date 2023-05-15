'use strict';

var utils = require('../utils/writer.js');
var NewOrder = require('../service/NewOrderService');

module.exports.new_order = function new_order (req, res, next, body) {
  NewOrder.new_order(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

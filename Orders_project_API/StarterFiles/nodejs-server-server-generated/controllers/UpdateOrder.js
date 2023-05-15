'use strict';

var utils = require('../utils/writer.js');
var UpdateOrder = require('../service/UpdateOrderService');

module.exports.update_order = function update_order (req, res, next, body, id) {
  UpdateOrder.update_order(body, id)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

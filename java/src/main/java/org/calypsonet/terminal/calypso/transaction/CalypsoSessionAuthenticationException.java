/* **************************************************************************************
 * Copyright (c) 2020 Calypso Networks Association https://calypsonet.org/
 *
 * See the NOTICE file(s) distributed with this work for additional information
 * regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License 2.0 which is available at http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 ************************************************************************************** */
package org.calypsonet.terminal.calypso.transaction;

/**
 * Indicates that the card has correctly closed the secure session, but the support is not authentic
 * because the signature of the card is incorrect.
 */
public class CalypsoSessionAuthenticationException extends CalypsoCardTransactionException {

  /** @param message the message to identify the exception context */
  public CalypsoSessionAuthenticationException(String message) {
    super(message);
  }

  /**
   * Encapsulates lower level exception.
   *
   * @param message message to identify the exception context.
   * @param cause the cause.
   */
  public CalypsoSessionAuthenticationException(String message, Throwable cause) {
    super(message, cause);
  }
}

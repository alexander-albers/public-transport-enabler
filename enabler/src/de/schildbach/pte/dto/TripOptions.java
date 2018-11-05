/*
 * Copyright the original author or authors.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package de.schildbach.pte.dto;

import java.util.Set;

import javax.annotation.Nullable;

import com.google.common.base.MoreObjects;
import com.google.common.base.MoreObjects.ToStringHelper;

import de.schildbach.pte.NetworkProvider;
import de.schildbach.pte.NetworkProvider.Accessibility;
import de.schildbach.pte.NetworkProvider.Optimize;
import de.schildbach.pte.NetworkProvider.Option;
import de.schildbach.pte.NetworkProvider.WalkSpeed;

/**
 * Options for {@link NetworkProvider#queryTrips()}.
 * 
 * @author Ialokim
 */
public class TripOptions {
    public final @Nullable Set<Product> products;
    public final @Nullable Optimize optimize;
    public final @Nullable WalkSpeed walkSpeed;
    public final @Nullable Accessibility accessibility;
    public final @Nullable Set<Option> options;

    /**
     * @param products
     *            products to take into account, or {@code null} for the provider default
     * @param optimize
     *            optimize trip for one aspect, e.g. duration
     * @param walkSpeed
     *            walking ability, or {@code null} for the provider default
     * @param accessibility
     *            route accessibility, or {@code null} for the provider default
     * @param options
     *            additional options, or {@code null} for the provider default
     */
    public TripOptions(@Nullable Set<Product> products, @Nullable Optimize optimize, @Nullable WalkSpeed walkSpeed,
            @Nullable Accessibility accessibility, @Nullable Set<Option> options) {
        this.products = products;
        this.optimize = optimize;
        this.walkSpeed = walkSpeed;
        this.accessibility = accessibility;
        this.options = options;
    }

    public TripOptions() {
        this.products = null;
        this.optimize = null;
        this.walkSpeed = null;
        this.accessibility = null;
        this.options = null;
    }

    @Override
    public String toString() {
        final ToStringHelper helper = MoreObjects.toStringHelper(this);
        helper.add("products", products);
        helper.addValue(optimize);
        helper.addValue(walkSpeed);
        helper.addValue(accessibility);
        helper.add("options", options);
        return helper.toString();
    }
}